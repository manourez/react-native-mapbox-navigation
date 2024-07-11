package com.homee.mapboxnavigation

import android.view.LayoutInflater
import com.facebook.react.uimanager.ThemedReactContext
import com.mapbox.navigation.dropin.NavigationView
import android.widget.FrameLayout

class MapboxNavigationView(private val context: ThemedReactContext, private val accessToken: String?) :
    FrameLayout(context.baseContext) {
private var binding: NavigationViewBinding =
    NavigationViewBinding.inflate(LayoutInflater.from(context), this, true)

    override fun onAttachedToWindow() {
        super.onAttachedToWindow()
        onCreate()
    }

    fun onCreate() {
        binding = MapboxActivityNavigationViewBinding.inflate(layoutInflater)
        binding.navigationView.api.routeReplayEnabled(true)
    }
}
