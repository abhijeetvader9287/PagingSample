package paging.android.example.com.pagingsample;

import java.lang.System;

/**
 * * A simple PagedListAdapter that binds Cheese items into CardViews.
 * * <p>
 * * PagedListAdapter is a RecyclerView.Adapter base class which can present the content of PagedLists
 * * in a RecyclerView. It requests new pages as the user scrolls, and handles new PagedLists by
 * * computing list differences on a background thread, and dispatching minimal, efficient updates to
 * * the RecyclerView to ensure minimal UI thread work.
 * * <p>
 * * If you want to use your own Adapter base class, try using a PagedListAdapterHelper inside your
 * * adapter instead.
 * *
 * * @see android.arch.paging.PagedListAdapter
 * * @see android.arch.paging.AsyncPagedListDiffer
 */
@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u000e2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u000eB\u0005\u00a2\u0006\u0002\u0010\u0004J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\tH\u0016J\u0018\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\tH\u0016\u00a8\u0006\u000f"}, d2 = {"Lpaging/android/example/com/pagingsample/CheeseAdapter;", "Landroid/arch/paging/PagedListAdapter;", "Lpaging/android/example/com/pagingsample/Cheese;", "Lpaging/android/example/com/pagingsample/CheeseViewHolder;", "()V", "onBindViewHolder", "", "holder", "position", "", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "Companion", "app_debug"})
public final class CheeseAdapter extends android.arch.paging.PagedListAdapter<paging.android.example.com.pagingsample.Cheese, paging.android.example.com.pagingsample.CheeseViewHolder> {
    
    /**
     * * This diff callback informs the PagedListAdapter how to compute list differences when new
     *         * PagedLists arrive.
     *         * <p>
     *         * When you add a Cheese with the 'Add' button, the PagedListAdapter uses diffCallback to
     *         * detect there's only a single item difference from before, so it only needs to animate and
     *         * rebind a single view.
     *         *
     *         * @see android.support.v7.util.DiffUtil
     */
    private static final android.support.v7.util.DiffUtil.ItemCallback<java.lang.Object> diffCallback = null;
    public static final paging.android.example.com.pagingsample.CheeseAdapter.Companion Companion = null;
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    paging.android.example.com.pagingsample.CheeseViewHolder holder, int position) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public paging.android.example.com.pagingsample.CheeseViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    public CheeseAdapter() {
        super(null);
    }
    
    @kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u0013\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\b\u0003*\u0001\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0010\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0004\n\u0002\u0010\u0005\u00a8\u0006\u0006"}, d2 = {"Lpaging/android/example/com/pagingsample/CheeseAdapter$Companion;", "", "()V", "diffCallback", "paging/android/example/com/pagingsample/CheeseAdapter$Companion$diffCallback$1", "Lpaging/android/example/com/pagingsample/CheeseAdapter$Companion$diffCallback$1;", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}