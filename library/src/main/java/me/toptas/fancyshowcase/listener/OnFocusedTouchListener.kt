package me.toptas.fancyshowcase.listener

import android.view.MotionEvent
import android.view.View


/**
 * Interface definition for a callback to be invoked when a touch event is
 * dispatched to this view. The callback will be invoked before the touch
 * event is given to the view.
 */
interface OnFocusedTouchListener {
    /**
     * Called when a touch event is dispatched to a view. This allows listeners to
     * get a chance to respond before the target view.
     *
     * @param v The view the touch event has been dispatched to.
     * @param event The MotionEvent object containing full information about
     * the event.
     * @param isWithin Indicates whether event happens within focus area or not
     * @return True if the listener has consumed the event, false otherwise.
     */
    fun onTouch(v: View, event: MotionEvent, isWithin: Boolean): Boolean
}