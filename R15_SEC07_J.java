protected PermissionCollection getPermissions(CodeSource cs) {
  PermissionCollection pc = new Permissions();
  // Allow exit from the VM anytime
  pc.add(new RuntimePermission("exitVM"));
  return pc;
}
