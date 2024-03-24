package com.pnguyen121.snkrs.extensions

import androidx.fragment.app.Fragment
import androidx.lifecycle.DefaultLifecycleObserver
import androidx.lifecycle.LifecycleOwner
import kotlin.properties.ReadWriteProperty
import kotlin.reflect.KProperty

class AutoClearedValue<T : Any>(val fragment: Fragment) : ReadWriteProperty<Fragment, T>, DefaultLifecycleObserver {
    private var _value: T? = null

    init {
        fragment.lifecycle.addObserver(this)
    }

    override fun getValue(thisRef: Fragment, property: KProperty<*>): T {
        return _value ?: throw IllegalStateException("Trying to read a destroyed value")
    }

    override fun setValue(thisRef: Fragment, property: KProperty<*>, value: T) {
        _value = value
    }

    override fun onDestroy(owner: LifecycleOwner) {
        super.onDestroy(owner)
        _value = null
    }
}

fun <T : Any> Fragment.autoCleared() = AutoClearedValue<T>(this)
