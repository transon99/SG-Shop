package com.spring_boot.SGShop.service;

import com.spring_boot.SGShop.modal.Address;

import java.util.List;
import java.util.Optional;

public interface AddressService {
    List<Address> getAllAddress();
    Optional<Address> getAddressById(Long id);
    Address inserAddress(Address address);

    String deleteUser(Long id);
    Optional<Address> updateUser(Long id, Address address);

}
