package com.mitm.junoon.Extra;
public class PojoLinear {
private final String codeName;
	 private final String codeversion;

        public PojoLinear(String codeName, String codeversion) {
        	 this.codeName = codeName;
        this.codeversion = codeversion;
       }
        public String getCodeName() {
        return codeName;
         }

        public String getCodeversion() {
     return codeversion;
         }
	}