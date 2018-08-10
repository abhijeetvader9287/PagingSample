package paging.android.example.com.pagingsample;

import java.lang.System;

/**
 * * A simple ViewModel that provides a paged list of delicious Cheeses.
 */
@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0004\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013J\u000e\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\bR;\u0010\u0005\u001a,\u0012(\u0012&\u0012\f\u0012\n \t*\u0004\u0018\u00010\b0\b \t*\u0012\u0012\f\u0012\n \t*\u0004\u0018\u00010\b0\b\u0018\u00010\u00070\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\f\u001a\u00020\r\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f\u00a8\u0006\u0017"}, d2 = {"Lpaging/android/example/com/pagingsample/CheeseViewModel;", "Landroid/arch/lifecycle/AndroidViewModel;", "app", "Landroid/app/Application;", "(Landroid/app/Application;)V", "allCheeses", "Landroid/arch/lifecycle/LiveData;", "Landroid/arch/paging/PagedList;", "Lpaging/android/example/com/pagingsample/Cheese;", "kotlin.jvm.PlatformType", "getAllCheeses", "()Landroid/arch/lifecycle/LiveData;", "dao", "Lpaging/android/example/com/pagingsample/CheeseDao;", "getDao", "()Lpaging/android/example/com/pagingsample/CheeseDao;", "insert", "", "text", "", "remove", "cheese", "Companion", "app_debug"})
public final class CheeseViewModel extends android.arch.lifecycle.AndroidViewModel {
    @org.jetbrains.annotations.NotNull()
    private final paging.android.example.com.pagingsample.CheeseDao dao = null;
    @org.jetbrains.annotations.NotNull()
    private final android.arch.lifecycle.LiveData<android.arch.paging.PagedList<paging.android.example.com.pagingsample.Cheese>> allCheeses = null;
    
    /**
     * * A good page size is a value that fills at least a screen worth of content on a large
     *         * device so the User is unlikely to see a null item.
     *         * You can play with this constant to observe the paging behavior.
     *         * <p>
     *         * It's possible to vary this with list device size, but often unnecessary, unless a user
     *         * scrolling on a large device is expected to scroll through items more quickly than a small
     *         * device, such as when the large device uses a grid layout of items.
     */
    private static final int PAGE_SIZE = 30;
    
    /**
     * * If placeholders are enabled, PagedList will report the full size but some items might
     *         * be null in onBind method (PagedListAdapter triggers a rebind when data is loaded).
     *         * <p>
     *         * If placeholders are disabled, onBind will never receive null but as more pages are
     *         * loaded, the scrollbars will jitter as new pages are loaded. You should probably disable
     *         * scrollbars if you disable placeholders.
     */
    private static final boolean ENABLE_PLACEHOLDERS = true;
    public static final paging.android.example.com.pagingsample.CheeseViewModel.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    public final paging.android.example.com.pagingsample.CheeseDao getDao() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.arch.lifecycle.LiveData<android.arch.paging.PagedList<paging.android.example.com.pagingsample.Cheese>> getAllCheeses() {
        return null;
    }
    
    public final void insert(@org.jetbrains.annotations.NotNull()
    java.lang.CharSequence text) {
    }
    
    public final void remove(@org.jetbrains.annotations.NotNull()
    paging.android.example.com.pagingsample.Cheese cheese) {
    }
    
    public CheeseViewModel(@org.jetbrains.annotations.NotNull()
    android.app.Application app) {
        super(null);
    }
    
    @kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0007"}, d2 = {"Lpaging/android/example/com/pagingsample/CheeseViewModel$Companion;", "", "()V", "ENABLE_PLACEHOLDERS", "", "PAGE_SIZE", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}