import { Injectable } from '@angular/core';
import { HttpClient, HttpErrorResponse } from '@angular/common/http';

import { AppConfig } from '../../share';
import { Report, Response } from '../../models';

import { Observable } from 'rxjs/observable';

@Injectable()
export class ReportsService {

    constructor(
        private appConfig: AppConfig,
        private http: HttpClient
    ) {
        console.log('initial report service');
    }

    // get report from server
    getReportsFromServer(): Observable<Response> {
        return this.http.get<Response>(this.appConfig.apiUrl + '/reports');
    }
}
