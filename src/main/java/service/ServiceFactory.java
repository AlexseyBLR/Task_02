package service;

import service.impl.SportEquipmentServiceImpl;

public final class ServiceFactory {

    private static final ServiceFactory instance = new ServiceFactory();

    private final SportEquipmentService applianceService = new SportEquipmentServiceImpl();

    private ServiceFactory() {
    }

    public SportEquipmentService getApplianceService() {

        return applianceService;
    }

    public static ServiceFactory getInstance() {
        return instance;
    }

}
