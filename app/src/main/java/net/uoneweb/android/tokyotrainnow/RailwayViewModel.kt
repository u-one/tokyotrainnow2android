package net.uoneweb.android.tokyotrainnow

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.flow.SharedFlow
import kotlinx.coroutines.flow.asSharedFlow
import kotlinx.coroutines.launch
import net.uoneweb.android.odpt.Railway
import net.uoneweb.android.odpt.RailwayRepository
import javax.inject.Inject

@HiltViewModel
class RailwayViewModel @Inject constructor(
    private val railwayRepository: RailwayRepository
) : ViewModel() {

    private val _railway = MutableSharedFlow<Railway>()
    val railway: SharedFlow<Railway> = _railway.asSharedFlow()

    init {
        viewModelScope.launch {
            railwayRepository.getRailwayData()
                .firstOrNull{ it.sameAs == "odpt.Railway:Toei.Oedo" }?.let{
                    _railway.emit(it)
                }
        }
    }
}