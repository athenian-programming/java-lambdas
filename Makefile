default: versioncheck

versioncheck:
	./gradlew dependencyUpdates

upgrade-wrapper:
	./gradlew wrapper --gradle-version=8.4 --distribution-type=bin