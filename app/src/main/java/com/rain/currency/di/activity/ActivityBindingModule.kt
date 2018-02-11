package com.rain.currency.di.activity

import com.rain.currency.ui.ConverterActivity
import com.rain.currency.ui.ConverterModule
import com.rain.currency.ui.ConverterService
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class ActivityBindingModule {

    @ActivityScope
    @ContributesAndroidInjector(modules = arrayOf(ConverterModule::class))
    abstract fun contributeConverterActivity(): ConverterActivity

    @ActivityScope
    @ContributesAndroidInjector(modules = arrayOf(ConverterModule::class))
    abstract fun contributeConverterService(): ConverterService
}
