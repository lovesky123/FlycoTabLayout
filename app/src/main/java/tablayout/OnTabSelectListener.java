package tablayout;

/**
 * @desc Tab选中与释放监听
 */
public interface OnTabSelectListener {
    void onTabSelect(int position);
    void onTabReselect(int position);
}