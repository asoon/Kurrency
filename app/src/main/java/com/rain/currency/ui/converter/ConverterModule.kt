package com.rain.currency.ui.converter

import com.rain.currency.data.repo.CurrencyRepo
import com.rain.currency.di.scope.ConverterScope
import com.rain.currency.domain.ConverterInteractor
import com.rain.currency.support.CurrencyMapper
import com.rain.currency.ui.converter.reducer.ConverterReducer
import com.rain.currency.ui.picker.CurrencyPickerDialog
import dagger.Module
import dagger.Provides

@Module
class ConverterModule {

    @Provides
    @ConverterScope
    fun provideConverterViewModel(currencyRepo: CurrencyRepo,
                                  reducer: ConverterReducer,
                                  currencyMapper: CurrencyMapper): ConverterViewModel {
        return ConverterViewModel(currencyRepo, reducer, currencyMapper)
    }

    @Provides
    @ConverterScope
    fun provideCurrencyPicker(service: ConverterService): CurrencyPickerDialog {
        return CurrencyPickerDialog(service)
    }

    @Provides
    @ConverterScope
    fun provideConverterReducer(interactor: ConverterInteractor): ConverterReducer {
        return ConverterReducer(interactor)
    }

    @Provides
    @ConverterScope
    fun provideConverterInteractor(): ConverterInteractor {
        return ConverterInteractor()
    }
}
