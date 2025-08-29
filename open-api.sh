#!/usr/bin/env bash

package_node="com"
group_id="pennyquin"
main_package_name="$package_node.$group_id.openapi"
artifact_id="my-health-framework"
open_api_yaml_path="openapi.yaml"

openapi-generator-cli generate -i "$open_api_yaml_path" -g spring -o tmp-api --library spring-boot --additional-properties=useJakartaEe=true --generate-alias-as-model --api-package "$main_package_name".api --model-package "$main_package_name".model --invoker-package "$main_package_name"


mv "tmp-api/src/main/java/$package_node/$group_id/openapi" "src/main/java/$package_node/$group_id"
mv "tmp-api/src/main/java/org/openapitools/configuration" "src/main/java/$package_node/$group_id/openapi"
rm -rf "tmp-api"

echo "Press ENTER to continue..."
read