package com.lambda

import com.lambda.client.plugin.api.Plugin
import com.lambda.modules.StashFinder

internal object StashFinderPlugin : Plugin() {

    override fun onLoad() {
        // Load any modules, commands, or HUD elements here
        modules.add(StashFinder)
    }

    override fun onUnload() {
        // Here you can unregister threads etc...
    }
}