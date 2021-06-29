package nz.isanaka.myfoodstock

import android.app.Application
import dagger.Component

@Component
interface ApplicationComponent {
    fun inject(application: Application)
}