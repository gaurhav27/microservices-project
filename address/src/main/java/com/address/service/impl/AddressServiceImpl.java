package com.address.service.impl;

import com.address.model.dto.AddressDto;
import com.address.model.dto.AddressRequest;
import com.address.model.dto.AddressRequestDto;
import com.address.model.entity.Address;
import com.address.repository.AddressRepository;
import com.address.service.AddressService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class AddressServiceImpl implements AddressService {

    private final AddressRepository addressRepository;
    private final ModelMapper modelMapper;

    public AddressServiceImpl(AddressRepository addressRepository, ModelMapper modelMapper) {
        this.addressRepository = addressRepository;
        this.modelMapper = modelMapper;
    }


    @Override
    public List<AddressDto> saveAddress(AddressRequest addressRequest) {
        // TODO: check if employee exists

        List<Address> listToSave = new ArrayList<>();

        for (AddressRequestDto addressRequestDto : addressRequest.getAddressRequestDtoList()) {
            Address address = new Address();
            address.setStreet(addressRequestDto.getStreet());
            address.setCity(addressRequestDto.getCity());
            address.setCountry(addressRequestDto.getCountry());
            address.setPinCode(addressRequestDto.getPinCode());
            address.setAddressType(addressRequestDto.getAddressType());
            address.setEmpId(addressRequest.getEmpId());
            listToSave.add(address);
        }

        List<Address> savedAddress = addressRepository.saveAll(listToSave);
        return savedAddress.stream().map(address -> modelMapper.map(address, AddressDto.class)).toList();
    }

    @Override
    public AddressDto updateAddress(AddressRequest addressRequest) {
        return null;
    }

    @Override
    public AddressDto getSingleAddress(Long id) {
        return null;
    }

    @Override
    public List<AddressDto> getAllAddress() {
        return List.of();
    }

    @Override
    public void deleteAddress(Long id) {

    }
}
