package paging.android.example.com.pagingsample;

import android.arch.paging.DataSource;
import android.arch.paging.DataSource.Factory;
import android.arch.persistence.db.SupportSQLiteStatement;
import android.arch.persistence.room.EntityDeletionOrUpdateAdapter;
import android.arch.persistence.room.EntityInsertionAdapter;
import android.arch.persistence.room.RoomDatabase;
import android.arch.persistence.room.RoomSQLiteQuery;
import android.arch.persistence.room.paging.LimitOffsetDataSource;
import android.database.Cursor;
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("unchecked")
public class CheeseDao_Impl implements CheeseDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter __insertionAdapterOfCheese;

  private final EntityDeletionOrUpdateAdapter __deletionAdapterOfCheese;

  public CheeseDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfCheese = new EntityInsertionAdapter<Cheese>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR ABORT INTO `Cheese`(`id`,`name`) VALUES (nullif(?, 0),?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Cheese value) {
        stmt.bindLong(1, value.getId());
        if (value.getName() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getName());
        }
      }
    };
    this.__deletionAdapterOfCheese = new EntityDeletionOrUpdateAdapter<Cheese>(__db) {
      @Override
      public String createQuery() {
        return "DELETE FROM `Cheese` WHERE `id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Cheese value) {
        stmt.bindLong(1, value.getId());
      }
    };
  }

  @Override
  public void insert(List<Cheese> cheeses) {
    __db.beginTransaction();
    try {
      __insertionAdapterOfCheese.insert(cheeses);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void insert(Cheese cheese) {
    __db.beginTransaction();
    try {
      __insertionAdapterOfCheese.insert(cheese);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void delete(Cheese cheese) {
    __db.beginTransaction();
    try {
      __deletionAdapterOfCheese.handle(cheese);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public DataSource.Factory<Integer, Cheese> allCheesesByName() {
    final String _sql = "SELECT * FROM Cheese ORDER BY name COLLATE NOCASE ASC";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return new DataSource.Factory<Integer, Cheese>() {
      @Override
      public LimitOffsetDataSource<Cheese> create() {
        return new LimitOffsetDataSource<Cheese>(__db, _statement, false , "Cheese") {
          @Override
          protected List<Cheese> convertRows(Cursor cursor) {
            final int _cursorIndexOfId = cursor.getColumnIndexOrThrow("id");
            final int _cursorIndexOfName = cursor.getColumnIndexOrThrow("name");
            final List<Cheese> _res = new ArrayList<Cheese>(cursor.getCount());
            while(cursor.moveToNext()) {
              final Cheese _item;
              final int _tmpId;
              _tmpId = cursor.getInt(_cursorIndexOfId);
              final String _tmpName;
              _tmpName = cursor.getString(_cursorIndexOfName);
              _item = new Cheese(_tmpId,_tmpName);
              _res.add(_item);
            }
            return _res;
          }
        };
      }
    };
  }
}
