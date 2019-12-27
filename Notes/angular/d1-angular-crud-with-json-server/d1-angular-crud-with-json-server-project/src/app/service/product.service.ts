import { Product } from './../model/product.model';
import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class ProductService {
  baseUrl: string = "http://localhost:1234";
  constructor(private http: HttpClient) {
  }
  getProducts() {
    return this.http.get<Product[]>(this.baseUrl + '/products');
  }
}
