import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable, Subject } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class ProductService {

  private baseUrl = 'http://ab479196e955b416cb4fc27daba3c4ff-2097313692.ap-south-1.elb.amazonaws.com:8080' //backendloadbalancer


  public cartAddedSubject = new Subject<boolean>();

  constructor(private http: HttpClient) { }

  getAllProducts(): Observable<any[]> {
    debugger;
    return this.http.get<any[]>(`${this.baseUrl}/products/all`);
  }
  
  makeSale(salePayload: any, options?: any): Observable<any> {
    return this.http.post<any>(`${this.baseUrl}/sales/makeSale`, salePayload, options);
  }
}
