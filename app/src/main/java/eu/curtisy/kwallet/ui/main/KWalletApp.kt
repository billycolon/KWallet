package eu.curtisy.kwallet.ui.main

import androidx.compose.runtime.Composable
import dev.chrisbanes.accompanist.insets.ProvideWindowInsets
import eu.curtisy.kwallet.ui.navigation.NavGraph
import eu.curtisy.kwallet.ui.theme.KWalletAppTheme

@Composable
fun KWalletApp() {
    ProvideWindowInsets {
        KWalletAppTheme {
            NavGraph()
        }
    }
}