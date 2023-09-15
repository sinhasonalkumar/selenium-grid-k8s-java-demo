# Step-1 Add docker-selenium helm repository
```
helm repo add docker-selenium https://www.selenium.dev/docker-selenium
```

# Step-2  Update charts from docker-selenium repo
```
helm repo update
```

# Step-3 List all versions present in the docker-selenium repo

```
helm search repo docker-selenium --versions
```

# Step-4 create selenium namespace

```
kubectl create ns selenium
```

# Step-5 switch selenium namespace

```
kubens selenium
```
# Step-6 install selenium grid helm chart

```
helm upgrade --install selenium-grid docker-selenium/selenium-grid --namespace selenium -f values.yaml
```

# Step-7 install selenium grid helm chart

```
kubectl get pods,svc
```

# Setp-8 Run this command for running selenium grid java test from IDE

```
k port-forward svc/selenium-hub 4444:4444
```
