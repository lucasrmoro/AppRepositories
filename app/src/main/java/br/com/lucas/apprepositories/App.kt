package br.com.lucas.apprepositories

import android.app.Application
import br.com.lucas.apprepositories.data.di.DataModule
import br.com.lucas.apprepositories.domain.di.DomainModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class App : Application() {

    override fun onCreate() {
        super.onCreate()

        startKoin {
            androidContext(this@App)
        }

        DataModule.load()
        DomainModule.load()
    }
}