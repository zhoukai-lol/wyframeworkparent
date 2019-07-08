package com.wangyi.service;

import com.wangyi.api.manager.TeacherControllerApi;
import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(value = "wy-service-manage-cms")
public interface TeacherService extends TeacherControllerApi {
}
