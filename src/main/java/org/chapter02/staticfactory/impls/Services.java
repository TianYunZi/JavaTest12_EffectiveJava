package org.chapter02.staticfactory.impls;

import org.chapter02.staticfactory.Provider;
import org.chapter02.staticfactory.Service;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by Admin on 2017/5/23.
 * 对于服务注册和访问，没有可实例化的类.
 */
public class Services {

    //阻止实例化
    private Services() {

    }

    //服务提供者
    private static final Map<String, Provider> PROVIDERS = new ConcurrentHashMap<>();
    public static final String DEFAULT_PROVIDER_NAME = "<def>";

    //服务提供者注册API
    //默认服务提供者名称
    public static void registerDefaultProvider(Provider provider) {
        registerProvider(DEFAULT_PROVIDER_NAME, provider);
    }

    //服务提供者注册API
    public static void registerProvider(String name, Provider provider) {
        PROVIDERS.put(name, provider);
    }

    //服务访问API
    //默认服务提供者名称
    public static Service newInstance() {
        return newInstance(DEFAULT_PROVIDER_NAME);
    }

    //服务访问API
    public static Service newInstance(String name) {
        Provider provider = PROVIDERS.get(name);
        if (provider == null) {
            throw new IllegalArgumentException("没有服务提供者用这个名字注册" + name);
        }
        return provider.newService();
    }
}
