package com.spring_boot.SGShop.service.serviceImpl;

import com.spring_boot.SGShop.dto.response.AddressResponse;
import com.spring_boot.SGShop.modal.Address;
import com.spring_boot.SGShop.repository.AddressRepository;
import com.spring_boot.SGShop.service.AddressService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
@RequiredArgsConstructor
public class AddressServiceImpl implements AddressService {
    private final AddressRepository addressRepository;


    @Override
    public List<AddressResponse> getAllAddress() {

        return null;
    }

    @Override
    public AddressResponse getAddressById(Long id) {
        return null;
    }

    @Override
    public AddressResponse createAddress(Address address) {
        addressRepository.save(address);
        return null;
    }

    @Override
    public String deleteAddress(Long id) {
        return null;
    }

    @Override
    public AddressResponse updateAddress(Long id, Address address) {
        return null;
    }
}
