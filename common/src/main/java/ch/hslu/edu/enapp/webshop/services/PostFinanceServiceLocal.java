package ch.hslu.edu.enapp.webshop.services;

import ch.hslu.edu.enapp.webshop.dto.PostFinanceResponse;

public interface PostFinanceServiceLocal {
    PostFinanceResponse send(int orderID, double amount);
}
