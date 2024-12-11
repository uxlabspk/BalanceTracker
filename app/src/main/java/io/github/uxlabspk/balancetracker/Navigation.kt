package io.github.uxlabspk.balancetracker

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import io.github.uxlabspk.balancetracker.views.HomePage
import io.github.uxlabspk.balancetracker.views.IntroductionPage
import io.github.uxlabspk.balancetracker.views.ProfilePage
import io.github.uxlabspk.balancetracker.views.ResetPage
import io.github.uxlabspk.balancetracker.views.SignInPage
import io.github.uxlabspk.balancetracker.views.SignUpPage
import io.github.uxlabspk.balancetracker.views.StatsPage

@Composable
fun BalanceTrackerNavHost(
    navController: NavHostController = rememberNavController()
) {
    val startScreen = "introduction"   // if (FirebaseAuth.getInstance().currentUser != null) "home" else "Welcome"

    NavHost(navController = navController, startDestination = startScreen) {
        composable("introduction") {
            IntroductionPage(navController)
        }
        composable("signin") {
            SignInPage(navController)
        }
        composable("signup") {
            SignUpPage(navController)
        }
        composable("home") {
            HomePage(navController)
        }
        composable("profile") {
            ProfilePage(navController)
        }
        composable("reset") {
            ResetPage(navController)
        }
        composable("stats") {
            StatsPage(navController)
        }
//        composable(
//            route = "result/{argument}",
//            arguments = listOf(navArgument("argument") { type = NavType.BoolType })
//        ) { backStackEntry ->
//            val argument = backStackEntry.arguments?.getBoolean("argument")
//            if (argument != null) {
//                ScanResults(navController = navController, isAutismTraits = argument)
//            }
//        }
    }
}