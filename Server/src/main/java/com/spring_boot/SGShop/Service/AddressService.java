package com.spring_boot.SGShop.Service;

import com.spring_boot.SGShop.Modal.Address;
import com.spring_boot.SGShop.Modal.User;
import com.spring_boot.SGShop.Repository.AddressRepository;

import java.util.List;
import java.util.Optional;

public interface AddressService {
    List<Address> getAllAddress();
    Optional<Address> getAddressById(Long id);
    Address inserAddress(Address address);

    String deleteUser(Long id);
    Optional<Address> updateUser(Long id, Address address);

}
