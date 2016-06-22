create index IX_D85DEA11 on Samplebook (groupId);
create index IX_4358CCDB on Samplebook (uuid_);
create index IX_B7E2306D on Samplebook (uuid_, companyId);
create unique index IX_2325EE2F on Samplebook (uuid_, groupId);

create index IX_777752B0 on Sampleentry (groupId, guestbookId);
create index IX_38FE4B46 on Sampleentry (uuid_);
create index IX_DFC21122 on Sampleentry (uuid_, companyId);
create unique index IX_F7807824 on Sampleentry (uuid_, groupId);