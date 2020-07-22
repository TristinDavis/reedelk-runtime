package com.reedelk.runtime.openapi.v3.model;

import com.reedelk.runtime.openapi.v3.OpenApiJsons;
import com.reedelk.runtime.openapi.v3.PredefinedSchema;
import org.junit.jupiter.api.Test;

class HeaderObjectTest extends AbstractOpenApiSerializableTest {

    @Test
    void shouldCorrectlySerializeHeaderWithAllPropertiesAndDefaultSchema() {
        // Given
        HeaderObject header = new HeaderObject();
        header.setAllowReserved(true);
        header.setDeprecated(true);
        header.setExplode(true);
        header.setExample("my header value");
        header.setDescription("My header description");
        header.setStyle(ParameterStyle.spaceDelimited);
        header.setPredefinedSchema(PredefinedSchema.ARRAY_STRING);

        // Expect
        assertSerializeJSON(header, OpenApiJsons.HeaderObject.WithAllPropertiesAndDefaultSchema);
    }

    /**
    @Test
    void shouldCorrectlySerializeHeaderWithCustomSchema() {
        // Given
        ResourceText schema = Mockito.mock(ResourceText.class);
        Mockito.doReturn(just(OpenApiJsons.Schemas.Pet.string())).when(schema).data();
        Mockito.doReturn("/assets/pet.schema.json").when(schema).path();

        HeaderObject header = new HeaderObject();
        header.setAllowReserved(true);
        header.setDeprecated(true);
        header.setExplode(true);
        header.setExample("my header value");
        header.setDescription("My header description");
        header.setStyle(ParameterStyle.spaceDelimited);
        header.setPredefinedSchema(PredefinedSchema.NONE);
        header.setSchema(schema);

        // Expect
        assertSerializedCorrectly(header, OpenApiJsons.HeaderObject.WithAllPropertiesAndCustomSchema);
    }**/

    @Test
    void shouldCorrectlySerializeHeaderWithDefaults() {
        // Given
        HeaderObject header = new HeaderObject();

        // Expect
        assertSerializeJSON(header, OpenApiJsons.HeaderObject.WithDefaults);
    }
}