package com.android.systemui.p404

import com.android.systemui.qs.tileimpl.QSTileImpl
import com.android.systemui.qs.tiles.PowerShareTile
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap
import dagger.multibindings.StringKey
@Module
interface P404Module {

    /** Inject PowerShareTile into tileMap in QSModule */
    @Binds
    @IntoMap
    @StringKey(PowerShareTile.TILE_SPEC)
    fun bindPowerShareTile(powerShareTile: PowerShareTile): QSTileImpl<*>
}

