/**
 * Copyright (c) 2011-2014, hubin (jobob@qq.com).
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.baomidou.mybatisplus.enums;

/**
 * <p>
 * 字段忽略策略枚举类
 * </p>
 *
 * @author hubin
 * @Date 2016-09-09
 */
public enum FieldIgnore {
    DEFAULT(0, "默认方式"),
    INSERT(1, "忽略插入"),
    UPDATE(2, "忽略更新"),
    INSERT_UPDATE(3, "忽略插入和更新");

    /**
     * 主键
     */
    private final int key;

    /**
     * 描述
     */
    private final String desc;

    FieldIgnore(final int key, final String desc) {
        this.key = key;
        this.desc = desc;
    }

    public static FieldIgnore getIgnore(int key) {
        FieldIgnore[] fis = FieldIgnore.values();
        for (FieldIgnore fi : fis) {
            if (fi.getKey() == key) {
                return fi;
            }
        }
        return FieldIgnore.DEFAULT;
    }

    public int getKey() {
        return this.key;
    }

    public String getDesc() {
        return this.desc;
    }

}
