package paging.android.example.com.pagingsample;

import java.lang.System;

/**
 * * Singleton database object. Note that for a real app, you should probably use a Dependency
 * * Injection framework or Service Locator to create the singleton database.
 */
@android.arch.persistence.room.Database(entities = {paging.android.example.com.pagingsample.Cheese.class}, version = 1)
@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\'\u0018\u0000 \u00052\u00020\u0001:\u0001\u0005B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H&\u00a8\u0006\u0006"}, d2 = {"Lpaging/android/example/com/pagingsample/CheeseDb;", "Landroid/arch/persistence/room/RoomDatabase;", "()V", "cheeseDao", "Lpaging/android/example/com/pagingsample/CheeseDao;", "Companion", "app_debug"})
public abstract class CheeseDb extends android.arch.persistence.room.RoomDatabase {
    private static paging.android.example.com.pagingsample.CheeseDb instance;
    public static final paging.android.example.com.pagingsample.CheeseDb.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    public abstract paging.android.example.com.pagingsample.CheeseDao cheeseDao();
    
    public CheeseDb() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0002J\u000e\u0010\t\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\bR\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"}, d2 = {"Lpaging/android/example/com/pagingsample/CheeseDb$Companion;", "", "()V", "instance", "Lpaging/android/example/com/pagingsample/CheeseDb;", "fillInDb", "", "context", "Landroid/content/Context;", "get", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final synchronized paging.android.example.com.pagingsample.CheeseDb get(@org.jetbrains.annotations.NotNull()
        android.content.Context context) {
            return null;
        }
        
        /**
         * * fill database with list of cheeses
         */
        private final void fillInDb(android.content.Context context) {
        }
        
        private Companion() {
            super();
        }
    }
}