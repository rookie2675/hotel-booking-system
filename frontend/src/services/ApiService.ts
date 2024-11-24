import { Injectable } from '@angular/core';

@Injectable({
    providedIn: 'root',
})
export class ApiService {
    private version: string;
    private url: string;

    constructor() {
        this.version = 'v1';
        this.url = `http://localhost:8080/api/${this.version}`;
    }

    getUrl() {
        return this.url;
    }
}
