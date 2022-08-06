package e.a.n;

import android.view.ActionMode;
import android.view.KeyEvent;
import android.view.KeyboardShortcutGroup;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.SearchEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityEvent;
import java.util.List;

/* compiled from: WindowCallbackWrapper */
public class i implements Window.Callback {

    /* renamed from: g  reason: collision with root package name */
    final Window.Callback f8412g;

    public i(Window.Callback callback) {
        if (callback != null) {
            this.f8412g = callback;
            return;
        }
        throw new IllegalArgumentException("Window callback may not be null");
    }

    public final Window.Callback a() {
        return this.f8412g;
    }

    public boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        return this.f8412g.dispatchGenericMotionEvent(motionEvent);
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return this.f8412g.dispatchKeyEvent(keyEvent);
    }

    public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        return this.f8412g.dispatchKeyShortcutEvent(keyEvent);
    }

    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return this.f8412g.dispatchPopulateAccessibilityEvent(accessibilityEvent);
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return this.f8412g.dispatchTouchEvent(motionEvent);
    }

    public boolean dispatchTrackballEvent(MotionEvent motionEvent) {
        return this.f8412g.dispatchTrackballEvent(motionEvent);
    }

    public void onActionModeFinished(ActionMode actionMode) {
        this.f8412g.onActionModeFinished(actionMode);
    }

    public void onActionModeStarted(ActionMode actionMode) {
        this.f8412g.onActionModeStarted(actionMode);
    }

    public void onAttachedToWindow() {
        this.f8412g.onAttachedToWindow();
    }

    public boolean onCreatePanelMenu(int i2, Menu menu) {
        return this.f8412g.onCreatePanelMenu(i2, menu);
    }

    public View onCreatePanelView(int i2) {
        return this.f8412g.onCreatePanelView(i2);
    }

    public void onDetachedFromWindow() {
        this.f8412g.onDetachedFromWindow();
    }

    public boolean onMenuItemSelected(int i2, MenuItem menuItem) {
        return this.f8412g.onMenuItemSelected(i2, menuItem);
    }

    public boolean onMenuOpened(int i2, Menu menu) {
        return this.f8412g.onMenuOpened(i2, menu);
    }

    public void onPanelClosed(int i2, Menu menu) {
        this.f8412g.onPanelClosed(i2, menu);
    }

    public void onPointerCaptureChanged(boolean z) {
        this.f8412g.onPointerCaptureChanged(z);
    }

    public boolean onPreparePanel(int i2, View view, Menu menu) {
        return this.f8412g.onPreparePanel(i2, view, menu);
    }

    public void onProvideKeyboardShortcuts(List<KeyboardShortcutGroup> list, Menu menu, int i2) {
        this.f8412g.onProvideKeyboardShortcuts(list, menu, i2);
    }

    public boolean onSearchRequested(SearchEvent searchEvent) {
        return this.f8412g.onSearchRequested(searchEvent);
    }

    public void onWindowAttributesChanged(WindowManager.LayoutParams layoutParams) {
        this.f8412g.onWindowAttributesChanged(layoutParams);
    }

    public void onWindowFocusChanged(boolean z) {
        this.f8412g.onWindowFocusChanged(z);
    }

    public ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
        return this.f8412g.onWindowStartingActionMode(callback);
    }

    public boolean onSearchRequested() {
        return this.f8412g.onSearchRequested();
    }

    public ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i2) {
        return this.f8412g.onWindowStartingActionMode(callback, i2);
    }
}
