package com.cyrilleroux.android.ws;

/**
 * Represents a view linked to a data object.
 * <p/>
 * The instances of this class are implemented in ws linked views.
 *
 * @author Cyril Leroux
 *         Created on 04/12/14
 */
public interface WsLinkedView<Data> {

    /**
     * Binds the data to the view.
     *
     * @param data The data to bind.
     */
    void bind(Data data);

    void onStartLoading();

    void onStopLoading();

    void onRequestFailure();
}
