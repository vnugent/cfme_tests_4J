Documentation project to help Java developers who are new to Python and [cmfe_tests](https://github.com/RedHatQE/cfme_tests/) to get started.  Whenever possible same Python variable, function and class names are used. Additional Java flavors such as intefaces and decorative classes are added to illustrate the framework's requirements that Provider author must fulfill.

## Key Python concepts (kind of foreign in Java)
- ***kwargs
- lambda 
- [partial functions](http://www.learnpython.org/en/Partial_functions)
- tuples

## Overview
Core components of cfme_tests framework:
- Low-level ui fixtures and navigation
- Base [Provider](https://github.com/RedHatQE/cfme_tests/blob/master/cfme/common/provider.py) fixture and existing Provider implementations (RHEV, Openstack, Openshift) follow the "Template method" design pattern.  
   - Base Provider defines CRUD operation flows and logic to fill CRUD form.
   - Concrete Provider implementation defines UI navigation paths (how to reach to the provider from the main menu bar), mapping from business-values to form/UI widgets as well as domain specific queries such as number of VMs (Cloud Providers) or pod count (Openshift/Kubernetes)

## Why fixtures?
Fixtures allows you to write test with high level of abstraction
```
provider = get_crud('hawkular')
provider.create()
```
vs low-level mouse-interaction (aka selenium 'force-nagivation')
```
click on Middleware -> Providers menu
fill in name, port number
click Add button
```

## Hawkular Provider walk-through
[Hawkular Provider](https://github.com/vnugent/cfme_tests_4J/blob/master/src/org/miq/test/middleware/HawkularProvider.java)
