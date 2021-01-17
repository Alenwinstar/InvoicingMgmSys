import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';

import { HomeComponent } from './home/home.component';

const routes: Routes = [
  // {path: '',
  // children: [
      { path: '', redirectTo: '/ImsHome', pathMatch: 'full' },
      { path: 'ImsHome', component: HomeComponent },
//   ]
// }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
