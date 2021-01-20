import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';

import { HomeComponent } from './home/home.component';

const routes: Routes = [
  {path: '',
   children: [
         { path: 'ImsHome', component: HomeComponent },
         { path: 'user', redirectTo: '/user', pathMatch: 'full'},
         { path: '', redirectTo: '/ImsHome', pathMatch: 'full' },
             ]
  }
];

@NgModule({
  imports: [RouterModule.forRoot(
    routes,
    { enableTracing: true}
    )],
  exports: [RouterModule]
})
export class AppRoutingModule { }
