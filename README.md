# sample_k8s_drill_config

Steps:
- Launched drill-admin (`kubectl apply -f drill-admin.yaml`)
- Launched drill-admin-ui
- Launched first-test-app
- Exposed ip and port of drill-admin and first-test-app (`minikube service drill-admin`)
- Launched test from rest-assured-tests folder against first-test-app (drill-admin ip configured in gradle plugin, app ip configured in test)
- Saved logs of drill-admin in drill-admin-logs.txt

