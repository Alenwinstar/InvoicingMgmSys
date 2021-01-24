import { Injectable } from '@angular/core';
import { CanActivate, ActivatedRouteSnapshot, RouterStateSnapshot, CanLoad, Route } from '@angular/router';
import { Observable } from 'rxjs/observable';

import { Store } from '@ngrx/store';
import * as fromStore from '../store';
import { tap, take } from 'rxjs/operators';
import { of } from 'rxjs/observable/of';

@Injectable()
export class AuthGuard implements CanActivate, CanLoad {

    constructor(
        private store: Store<fromStore.State>,
    ) { }

    canActivate(
        next: ActivatedRouteSnapshot,
        state: RouterStateSnapshot): Observable<boolean> | Promise<boolean> | boolean {
        const url: string = state.url;
        return this.checkLogin(url);
    }


    canLoad(route: Route): Observable<boolean> {
        const url = `/${route.path}`;
        return this.checkLogin(url);
    }


    checkLogin(url: string): Observable<boolean> {
        return this.store.select(fromStore.getIsLogin).pipe(
            tap(status => {
                if (!status) {
                    this.store.dispatch(new fromStore.Go({ path: ['user/login'] }));
                }
                console.log('current status', status);
            }),
            take(1)
        );

    }

}
