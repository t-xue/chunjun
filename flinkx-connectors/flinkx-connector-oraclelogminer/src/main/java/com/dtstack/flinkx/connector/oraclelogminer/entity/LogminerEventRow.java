/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.dtstack.flinkx.connector.oraclelogminer.entity;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.List;

public class LogminerEventRow implements Serializable {
    private static final long serialVersionUID = 1L;

    private List<Column> beforeColumnList;

    private List<Column> afterColumnList;

    private Long scn;

    /** INSERT UPDATE DELETE **/
    private String type;

    private String schema;

    private String table;

    private Long ts;

    private Timestamp opTime;


    public LogminerEventRow(List<Column> beforeColumn, List<Column> afterColumn, Long scn, String type, String schema, String table, Long ts, Timestamp timestamp) {
        this.beforeColumnList = beforeColumn;
        this.afterColumnList = afterColumn;
        this.scn = scn;
        this.type = type;
        this.schema = schema;
        this.table = table;
        this.ts = ts;
        this.opTime = timestamp;
    }

    public List<Column> getBeforeColumnList() {
        return beforeColumnList;
    }

    public List<Column> getAfterColumnList() {
        return afterColumnList;
    }

    public Long getScn() {
        return scn;
    }

    public String getType() {
        return type;
    }

    public String getSchema() {
        return schema;
    }

    public String getTable() {
        return table;
    }

    public Long getTs() {
        return ts;
    }

    public Timestamp getOpTime() {
        return opTime;
    }

    public void setBeforeColumnList(List<Column> beforeColumnList) {
        this.beforeColumnList = beforeColumnList;
    }

    public void setAfterColumnList(List<Column> afterColumnList) {
        this.afterColumnList = afterColumnList;
    }

    public void setScn(Long scn) {
        this.scn = scn;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setSchema(String schema) {
        this.schema = schema;
    }

    public void setTable(String table) {
        this.table = table;
    }

    public void setTs(Long ts) {
        this.ts = ts;
    }

    public void setOpTime(Timestamp opTime) {
        this.opTime = opTime;
    }

    @Override
    public String toString() {
        return "LogminerEventRow{" +
                "beforeColumn=" + beforeColumnList +
                ", afterColumn=" + afterColumnList +
                ", scn=" + scn +
                ", type='" + type + '\'' +
                ", schema='" + schema + '\'' +
                ", table='" + table + '\'' +
                ", ts=" + ts +
                ", timestamp=" + opTime +
                '}';
    }

     public static class Column {
        private String name;
        private String data;
        private boolean isNull;


        public Column(String name, String data, boolean isNull) {
            this.name = name;
            this.data = data;
            this.isNull = isNull;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getData() {
            return data;
        }

        public void setData(String data) {
            this.data = data;
        }

        public boolean isNull() {
            return isNull;
        }

        public void setNull(boolean aNull) {
            isNull = aNull;
        }

        @Override
        public String toString() {
            return "Column{" +
                    "name='" + name + '\'' +
                    ", data='" + data + '\'' +
                    ", isNull=" + isNull +
                    '}';
        }

    }


}
