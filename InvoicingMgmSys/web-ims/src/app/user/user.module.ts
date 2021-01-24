import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { UserRoutingModule } from './user-routing.module';
import { LoginComponent } from './login/login.component';
import { ShareModule } from '../share/share.module';
import { UserService } from './service/user.service';
import { HttpClientModule } from '@angular/common/http';

@NgModule({
  declarations: [LoginComponent],
  imports: [
    CommonModule,
    UserRoutingModule,
    ShareModule,
    HttpClientModule,
  ],
  providers: [UserService]
})
export class UserModule { }
