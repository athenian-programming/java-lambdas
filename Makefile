default: versioncheck

jarcheck:
	./mvnw versions:display-dependency-updates

plugincheck:
	./mvnw versions:display-plugin-updates

versioncheck: jarcheck plugincheck
