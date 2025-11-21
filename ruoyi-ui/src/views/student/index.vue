<template>
  <a-table
    :columns="columns"
    :data-source="data"
    :row-key="record => record.login.uuid"
    :pagination="pagination"
    :loading="loading"
    @change="handleTableChange"
  >
    <template slot="name" slot-scope="text, record">
      {{ record.name.first }} {{ record.name.last }}
    </template>
  </a-table>
</template>

<script>
import axios from 'axios';

export default {
  data() {
    return {
      data: [],
      pagination: { current: 1, pageSize: 10, total: 0 },
      loading: false,
      columns: [
        {
          title: 'Name',
          dataIndex: 'name',
          scopedSlots: { customRender: 'name' },
        },
        {
          title: 'Gender',
          dataIndex: 'gender',
          filters: [
            { text: 'Male', value: 'male' },
            { text: 'Female', value: 'female' },
          ],
        },
        {
          title: 'Email',
          dataIndex: 'email',
        },
      ],
    };
  },
  mounted() {
    this.fetch();
  },
  methods: {
    handleTableChange(pagination, filters, sorter) {
      const pager = { ...this.pagination };
      pager.current = pagination.current;
      this.pagination = pager;
      this.fetch({
        results: pagination.pageSize,
        page: pagination.current,
        ...filters,
      });
    },
    fetch(params = {}) {
      this.loading = true;
      axios
        .get('https://randomuser.me/api', { params: { results: 10, ...params } })
        .then((res) => {
          this.data = res.data.results;
          this.pagination.total = 200; // 假定总条数
          this.loading = false;
        });
    },
  },
};
</script>
