package com.spring_boot.SGShop.service;

import com.spring_boot.SGShop.dto.response.AddressResponse;
import com.spring_boot.SGShop.modal.Address;

import java.util.List;
import java.util.Optional;

public interface AddressService {
    List<AddressResponse> getAllAddress();
    AddressResponse getAddressById(Long id);
    AddressResponse createAddress(Address address);

    String deleteAddress(Long id);
    AddressResponse updateAddress(Long id, Address address);

}
