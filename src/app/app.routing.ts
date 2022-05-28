import { NgModule } from '@angular/core';
import { CommonModule, } from '@angular/common';
import { BrowserModule  } from '@angular/platform-browser';
import { Routes, RouterModule } from '@angular/router';
import { LandingComponent } from './examples/landing/landing.component';
import { LoginComponent } from './login/login.component';
import { RegistrationCompComponent } from './registration-comp/registration-comp.component';
import { HomepageComponent } from './homepage/homepage.component';


const routes: Routes =[
    { path: '', redirectTo: 'login', pathMatch: 'full' },
    { path: 'homepage',          component: HomepageComponent },
    { path: 'login',          component: LoginComponent },
    { path: 'registration',          component: RegistrationCompComponent },

];

@NgModule({
  imports: [
    CommonModule,
    BrowserModule,
    RouterModule.forRoot(routes,{
      useHash: true
    })
  ],
  exports: [
  ],
})
export class AppRoutingModule { }
