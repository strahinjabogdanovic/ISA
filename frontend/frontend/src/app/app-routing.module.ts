import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { HomePageComponent } from './pages/home-page/home-page.component';
import { LoginPageComponent } from './pages/login/login-page.component';
import { RegistrationPageComponent } from './pages/registration/registration-page.component';

const routes: Routes = [
  { path: '', pathMatch:'full', redirectTo:'landingPage'},
  { path: 'landingPage', component: HomePageComponent},
  { path: 'login', component:LoginPageComponent},
  { path: 'registration', component:RegistrationPageComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
