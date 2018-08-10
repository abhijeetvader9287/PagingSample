package paging.android.example.com.pagingsample;

import java.lang.System;

/**
 * * Database Access Object for the Cheese database.
 */
@android.arch.persistence.room.Dao()
@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\bg\u0018\u00002\u00020\u0001J\u0014\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\'J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0005H\'J\u0016\u0010\t\u001a\u00020\u00072\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u000bH\'J\u0010\u0010\t\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0005H\'\u00a8\u0006\f"}, d2 = {"Lpaging/android/example/com/pagingsample/CheeseDao;", "", "allCheesesByName", "Landroid/arch/paging/DataSource$Factory;", "", "Lpaging/android/example/com/pagingsample/Cheese;", "delete", "", "cheese", "insert", "cheeses", "", "app_debug"})
public abstract interface CheeseDao {
    
    /**
     * * Room knows how to return a LivePagedListProvider, from which we can get a LiveData and serve
     *     * it back to UI via ViewModel.
     */
    @org.jetbrains.annotations.NotNull()
    @android.arch.persistence.room.Query(value = "SELECT * FROM Cheese ORDER BY name COLLATE NOCASE ASC")
    public abstract android.arch.paging.DataSource.Factory<java.lang.Integer, paging.android.example.com.pagingsample.Cheese> allCheesesByName();
    
    @android.arch.persistence.room.Insert()
    public abstract void insert(@org.jetbrains.annotations.NotNull()
    java.util.List<paging.android.example.com.pagingsample.Cheese> cheeses);
    
    @android.arch.persistence.room.Insert()
    public abstract void insert(@org.jetbrains.annotations.NotNull()
    paging.android.example.com.pagingsample.Cheese cheese);
    
    @android.arch.persistence.room.Delete()
    public abstract void delete(@org.jetbrains.annotations.NotNull()
    paging.android.example.com.pagingsample.Cheese cheese);
}