package com.example.abdelrahman.bloodtypediet;

import android.net.Uri;

/**
 * Created by abdelrahman on 28/10/16.
 */
public interface DataFetched {
public void update(String data);
    Uri.Builder buildUri(String data);
}
