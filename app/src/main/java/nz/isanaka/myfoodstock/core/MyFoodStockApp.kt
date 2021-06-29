package nz.isanaka.myfoodstock.core

import android.app.Application
import nz.isanaka.myfoodstock.ApplicationComponent
import nz.isanaka.myfoodstock.DaggerApplicationComponent

class MyFoodStockApp: Application() {
    lateinit var applicationComponent: ApplicationComponent

    override fun onCreate() {
        super.onCreate()
        initializeDI()
    }

    private fun initializeDI() {
        applicationComponent = DaggerApplicationComponent.builder().build()
        applicationComponent.inject(this)
    }
}