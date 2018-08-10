package paging.android.example.com.pagingsample;

import java.lang.System;

/**
 * * A simple ViewHolder that can bind a Cheese item. It also accepts null items since the data may
 * * not have been fetched before it is bound.
 */
@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u0016\u0010\u000b\u001a\n \r*\u0004\u0018\u00010\f0\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0010"}, d2 = {"Lpaging/android/example/com/pagingsample/CheeseViewHolder;", "Landroid/support/v7/widget/RecyclerView$ViewHolder;", "parent", "Landroid/view/ViewGroup;", "(Landroid/view/ViewGroup;)V", "cheese", "Lpaging/android/example/com/pagingsample/Cheese;", "getCheese", "()Lpaging/android/example/com/pagingsample/Cheese;", "setCheese", "(Lpaging/android/example/com/pagingsample/Cheese;)V", "nameView", "Landroid/widget/TextView;", "kotlin.jvm.PlatformType", "bindTo", "", "app_debug"})
public final class CheeseViewHolder extends android.support.v7.widget.RecyclerView.ViewHolder {
    private final android.widget.TextView nameView = null;
    @org.jetbrains.annotations.Nullable()
    private paging.android.example.com.pagingsample.Cheese cheese;
    
    @org.jetbrains.annotations.Nullable()
    public final paging.android.example.com.pagingsample.Cheese getCheese() {
        return null;
    }
    
    public final void setCheese(@org.jetbrains.annotations.Nullable()
    paging.android.example.com.pagingsample.Cheese p0) {
    }
    
    /**
     * * Items might be null if they are not paged in yet. PagedListAdapter will re-bind the
     *     * ViewHolder when Item is loaded.
     */
    public final void bindTo(@org.jetbrains.annotations.Nullable()
    paging.android.example.com.pagingsample.Cheese cheese) {
    }
    
    public CheeseViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent) {
        super(null);
    }
}