package com.spring_boot.SGShop.Repository.Impl;

import com.spring_boot.SGShop.Modal.Address;
import com.spring_boot.SGShop.Repository.AddressRepository;
import jakarta.persistence.EntityManager;

public class AddressRepoImpl extends BaseRepoImpl<Address, Long> implements AddressRepository {

    public AddressRepoImpl(Class<Address> domainClass, EntityManager em) {
        super(domainClass, em);
    }
}
